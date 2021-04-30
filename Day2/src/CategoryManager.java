
public class CategoryManager{
	public void Add(Category category) {
		System.out.println(category.name +  " isimli kategori eklendi");
	}
	
	public void Delete(Category category) {
		System.out.println(category.name +  " isimli kategori silindi");
	}
	
	public void Update(Category category) {
		System.out.println(category.name +  " isimli kategori güncellendi");
	}
}
