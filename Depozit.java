
    public class Depozit
    {
        Scandura[] scanduraDinMagazin=null;
        Paleti[] paletiDinMagazin=null;
        Bustean[] busteanDinMagazin=null;
        int rand;
        String categorie;
        String vopsea;
        public Depozit(int rand,String categorie,String vopsea)
        {
            scanduraDinMagazin=GetScandura();
            paletiDinMagazin=GetPaleti();
            busteanDinMagazin=GetBustean();
            this.rand=rand;
            this.categorie=categorie;
            this.vopsea=vopsea;
        }
        public static   Scandura[] GetScandura(){
            Scandura Brad = new Scandura ("A", 20, 1000);
            Scandura Stejar = new Scandura ("A", 30, 5050);
            Scandura Artar = new Scandura ("B", 100, 200);
            Scandura[] scanduraDinMagazin = {Brad,Stejar, Artar};
            return scanduraDinMagazin;
        }
        public static   Paleti[] GetPaleti(){
            Paleti Brad = new Paleti ("A", 20, 1000);
            Paleti Stejar = new Paleti ("A", 30, 5050);
            Paleti Artar = new Paleti ("B", 100, 200);
            Paleti[] paletiDinMagazin = {Brad,Stejar, Artar};
            return paletiDinMagazin;
        }
        public static   Bustean[] GetBustean(){
            Bustean Brad = new Bustean ("A", 20, 1000);
            Bustean Stejar = new Bustean ("A", 30, 5050);
            Bustean Artar = new Bustean ("B", 100, 200);
            Bustean[] busteanDinMagazin = {Brad,Stejar, Artar};
            return busteanDinMagazin;
        }
    }


