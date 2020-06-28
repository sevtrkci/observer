package observer.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class SearchProcess {
	
	List<Arama> observer = new ArrayList<>();
	
	public SearchProcess() {
		observer.add(new KufurluKelime());
		observer.add(new Tamamla());
		observer.add(new Kaydet());
	}
	
	public void search() {
		for(Arama a : observer) {
			a.islemYap();
		}
		
	}

}
