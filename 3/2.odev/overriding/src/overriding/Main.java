package overriding;

public class Main {

	public static void main(String[] args) {
		// OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		// System.out.println(ogretmenKrediManager.hesapla(1000));
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new TarimKrediManager(),
				new OgretmenKrediManager(),
				new OgrenciKrediManager()};
		for(BaseKrediManager kredi:krediManagers) {
			System.out.println(kredi.hesapla(1000));
		}
	}

}
