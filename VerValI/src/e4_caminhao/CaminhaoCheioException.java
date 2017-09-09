package e4_caminhao;

public class CaminhaoCheioException extends Exception {
	private String msg;
    public CaminhaoCheioException(String msg){
      super(msg);
      this.msg = msg;
    }
}
