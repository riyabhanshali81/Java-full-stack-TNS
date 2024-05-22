package manthan.rejon.countrystatpack;

public class country {
	
		private String conname;
		public country() {
			
		}
		
		public country(String conname) {
			this.conname = conname;
		}
		
		public String getConname() {
			return conname;
		}

		public void setConname(String conname) {
			this.conname = conname;
		}

		@Override
		public String toString() {
			return "country [conname=" + conname + "]";
		}
	
}
