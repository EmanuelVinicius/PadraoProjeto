package Factorys;
import Class.CartaoCredito;
import Factorys.Ifabrica;
public class CartaoCreditoFactory {

    public CartaoCredito getPreco() {
        return new CartaoCredito();
    }

}
