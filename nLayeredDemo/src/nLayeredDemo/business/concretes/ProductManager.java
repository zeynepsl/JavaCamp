package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
		//kendi interface'imi bilirim
		//baþkasýnýn servisinin interface'ini kullanarak ona baðýmlý olmam
		//microservis mimarisi
		
	}
	//hiçbir þekilde hibernate e baðlý deðilim
	//ama hibernate in referansýný tutabilen ProductDao ya gevþek baðýmlýyým
	//hibernate, abc vs serviceleri gelecekte de enjekte edebilirm

	@Override
	public void add(Product product) {
		//iþ kodlarý
		if(product.getCategoryId()==1) {
			System.out.println("bu kategoride ürün kabul edilmiyor");
			return;
			//veri eriþime gitmesini istemiyorum
			//boþ return: metodu bitir
		}
		productDao.add(product);
		loggerService.logToSystem("urun eklendi : " + product.getName());
		//HibernateProductDao dao = new HibernateProductDao();
		//dao.add(product);
		//böyle olursa alternatif servis ekleyemeem
		//Manager'ý dataAccess e böyle sýký sýký baðlarsan unitTest de yazamazsýn
		//unitTest : kodu kod ile test etme
		//         : iþ katmanýný kontrol ediyorsan veritabanýna gidemezsin
		//ama bu gidiyor
		//db ler sürekli degiskenlik göstereceði için test senaryolarýmýz çalýþmaz
		//unitTest yazrken sahte yapilar ile çalýþýrýz
		
		//dependency injection yapýcaz 
		//sen dataAcces e baðýmlýsýn ama gevþek baðýmlýsýn
		//dataAccess in sadece, referans tutucu olan abstaract klasöründeki yapýsýna baðlanabilrisn
		//manager Hibernate ten asla haberdar deðil
		//manager, sadece kullanacaðý dataAccess interface inden haberdar
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
