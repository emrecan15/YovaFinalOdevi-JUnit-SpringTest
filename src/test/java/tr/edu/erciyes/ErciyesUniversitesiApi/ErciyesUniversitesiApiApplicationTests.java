package tr.edu.erciyes.ErciyesUniversitesiApi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import tr.edu.erciyes.ErciyesUniversitesiApi.*;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class ErciyesUniversitesiApiApplicationTests {
	DersApi dersApi = new DersApi();
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void Ekle() {
		dersApi.ekle();
		boolean kontrol = false;
		
		if(dersApi.DERSLER.size() > 0) {
			kontrol = true;
		}
		
		assertEquals(true,kontrol);

	}
	@Test
	public void Listele() {
		ArrayList<String> deneme = new ArrayList<>();
		deneme = (ArrayList<String>) dersApi.listele();

		assertEquals("[Matematik, Fizik, Kimya, Biyoloji]" , deneme.toString());
		
		
		
	}
	
	@Test
	public void Sil() {
		dersApi.sil();
		boolean kontrol = false;
		if(dersApi.DERSLER.size() == 0)
		{
			kontrol = true;
		}

		assertEquals(true,kontrol);
	}

}
