import java.util.*;
public class riepilogativo {

	public static void main(String[] args) {
		int N, i, setGiovanna;
		boolean annaTrovato=false, sillaba;
		String vettoreStringa;
		
		Scanner in=new Scanner(System.in);
		
		do {
			System.out.println("Inserisci il numero degli elementi del vettore");
			N=in.nextInt();
			if (N==0) {
				System.out.println("Errore! Non puoi inserire un numero pari e 0. Reinserisci il valore");
			}
		} while (N==0);
		
		Vector <String> v=new Vector <String> (N);
		
		System.out.println("Inserisci i nomi degli studenti:");
		
		for (i=0; i<N; i++) {
			v.add(in.next());		
		}
		
		i=0;
		
		while (annaTrovato=false && i<N) {
			if (v.get(i)=="Anna") {
				annaTrovato=true;
			}
			i++;
		}
		
		if (annaTrovato=true) {
			System.out.println("Il nome Anna è presente nel vettore");
		} else {
			System.out.println("Il nome Anna non è presente nel vettore");
		}
		
		setGiovanna=v.indexOf("Giovanna");
		
		if (setGiovanna!=-1) {
			v.set(setGiovanna, "Gianna");
		}
		
		v.remove("Alberto");
		
		System.out.println("La dimensione attuale del vettore è " +v.size());
		
		vettoreStringa=v.toString();
		
		sillaba=vettoreStringa.contains("do");
		
		if (sillaba) {
			System.out.println("All'interno del vettore è presente la sillaba do");
		} else {
			System.out.println("All'interno del vettore non è presente la sillaba do");
		}
		
		Collections.sort(v);
		
		System.out.println("Il primo nome in ordine decrescente è " +v.lastElement()+ ", mentre l'ultimo è " +v.firstElement());
		
		in.close();
	}

}
