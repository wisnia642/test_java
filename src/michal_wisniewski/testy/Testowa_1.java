package michal_wisniewski.testy;


public class Testowa_1 {

        //declaration variables
        boolean isTall = true;
        boolean hasblueis = true;
        private int size;
        private int size_more;

        //deklaracja metody - zestaw instrukcji
        boolean isBig(int someOne, int somethere)
        {
            this.size = someOne;
            size_more = somethere;

            String nowa;

            someOne=20;

            return someOne>=0;
        }
        public Testowa_1(int size , int size1)
        {
            this.size=size;
            this.size_more=size1;
        }

        //konstruktor - nowa instancja klasy
        public Testowa_1(int size) {
        this.size = size;
    }
}


