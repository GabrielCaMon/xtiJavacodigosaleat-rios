package exception;

public class SenhaTeste {
	
	static void autenticar(String senha) throws SenhaInvalidaException {
		if("123".equals(senha)) {
			//autenticado
			System.out.println("Autenticado");
		}else {
			//a senha é incorreta
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}
	
	public static void main(String[] args) {
		try {
			autenticar("33");
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
