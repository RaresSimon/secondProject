
    public class ContBancar
    {


        private double _sold=0;
        private double _profit=0;
        public ContBancar(int _sold)
        {
            this._sold=_sold;

        }
        public void DepozitareSuma(double suma)
        {
            _sold=_sold+suma;
        }
        public void cumparareMateriale(double suma)
        {
            _sold= _sold-suma;
        }
        public double check_sold() {
            return _sold;
        }
        public void profit(double _profit)
        {
            this._profit+=_profit;
        }
        public  double get_profit()
        {
            return _profit;
        }
    }


