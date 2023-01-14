package tr.edu.erciyes.ErciyesUniversitesiApi;

import java.util.*;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ders")
public class DersApi {
	
	
	public static final List<String> DERSLER = new ArrayList<>();
	
	
	@GetMapping("/ekle")
	public void ekle(){
		DERSLER.add("Matematik");
		DERSLER.add("Fizik");
		DERSLER.add("Kimya");
		DERSLER.add("Biyoloji");
		
	}
	
	@GetMapping("/listele")
	public List<String> listele(){
		return DERSLER;
	}
	
	@GetMapping("/sil")
	public void sil() {
		DERSLER.clear();
	}
	
	
}
