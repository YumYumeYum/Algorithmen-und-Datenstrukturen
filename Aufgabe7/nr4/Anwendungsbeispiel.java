import java.util.HashMap;
import java.util.Map;

public class Anwendungsbeispiel {
   public static void main(String[] args) {
      Zahlungsmittel geld[]= {new USD_Muenze(0.10), new USD_Schein(20),   new SFR_Schein(5),
                              new SFR_Muenze(0.50), new USD_Muenze(0.50), new EUR_Schein(50),
                              new USD_Schein(100),  new USD_Muenze(0.2),  new USD_Muenze(0.25),
                              new EUR_Muenze(0.01), new SFR_Schein(200),  new USD_Schein(100),
                              new EUR_Muenze(2),    new EUR_Schein(5),    new USD_Muenze(0.25),
                              new SFR_Muenze(0.10), new SFR_Muenze(0.01), new USD_Muenze(0.50),
                              new USD_Schein(100),  new USD_Schein(100),  new USD_Muenze(0.2),
                              new USD_Muenze(0.01), new SFR_Schein(20),   new SFR_Muenze(0.50),
                              new USD_Muenze(0.50), new EUR_Schein(50),   new USD_Schein(5),
		                        new EUR_Muenze(0.50), new EUR_Muenze(0.01), new SFR_Schein(10),
		                        new SFR_Schein(20),   new SFR_Muenze(0.50), new SFR_Muenze(0.02)};

      int validCount = 0;
      int invalidCount = 0;
      
      //iteration gültigkeit + laenge
      for(Zahlungsmittel obj : geld){
         if(obj.wertIstGueltig()){
            validCount++;
            System.out.println("Waehrung = " + obj.getWaehrung() + "\n" + 
            "Wert = " + obj.getWert());

            //ungueltige zaehlen
         }else{
            invalidCount++;
            System.out.println("\ninvalid count = " + invalidCount + "\n");
         }
      }

      Zahlungsmittel[] validGeld = new Zahlungsmittel[validCount];   //ich hasse java in C waere nur "datatype arr[lentgth];" :(
      int index = 0;
      //neues (valid)array fuellen
      for(Zahlungsmittel obj : geld){
         if(obj.wertIstGueltig()){
            validGeld[index++] = obj;
         }
      }

      for(Zahlungsmittel obj : validGeld){
         System.out.println(obj.getWaehrung() + "\n");
      }

      Map<String, Double> totalValueMap = new HashMap<>();
      double totalWeight = 0.0;
      double totalSurface = 0.0;
      double totalCoinHeight = 0.0;

      for (Zahlungsmittel obj : validGeld) {
         //Gesamtwert unterschieldicher Waehrung
         totalValueMap.put(obj.getWaehrung(), 
            totalValueMap.getOrDefault(obj.getWaehrung(), 0.0) + obj.getWert());

         //Gesamtgewicht aller muenzen
         if(obj instanceof Muenze){
            Muenze muenze = (Muenze) obj; //downcast, Zahlungsmittel kennt .getGewicht nicht
            totalWeight += muenze.getGewicht();

            //groeße muenzen in cm
            double coinHeight = muenze.getDicke() / 10;
            totalCoinHeight += coinHeight; 
         }

         //flaeche Scheine
         if(obj instanceof Schein){
            Schein schein = (Schein) obj;

            double width_cm = schein.getBreite() / 10;   //da mm
            double height_cm = schein.getLaenge() / 10;

            totalSurface += (width_cm * height_cm);
         }

     }

      SortierungCompare.mergesort(validGeld);

     
      //nur print zum debuggen

      for (Map.Entry<String, Double> entry : totalValueMap.entrySet()) {
      System.out.println("Währung: " + entry.getKey() + ", Summe: " + entry.getValue());
      }
      System.out.println("muenzen Gesamtgewicht in Gramm = " + totalWeight + "\n");
      System.out.println("Gesamtflaeche = " + totalSurface + "\n");
      System.out.println("Muenz hoehe = " + totalCoinHeight + "\n");

      for(int i = 0; i < validGeld.length; i++){
         System.out.println("Wert an validGeld["+i+"] = " + validGeld[i].getWert());
      }

//---------------------------------------------------------------------------------------//
      //ab hier Liste
      System.out.println("\nAb hier die Liste l:");
      MyList<Zahlungsmittel> l= new MyList<>();
      for (Zahlungsmittel obj : validGeld){
         l.add(obj);
      }
      l.remove(l.size()/2);
      for (int i=l.size()-1; i>=0; --i)
         System.out.print(" " + l.get(i));
      System.out.println();








  }

}
