package app;

import javax.xml.namespace.QName;
import javax.mal.ws.Service;
import java.net.URL;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = Style.RPC)
public interface CaixaServer {
    @WebMethod String escanearProduto(String codigoBarras);
    @WebMethod boolean verificarProduto(String codigoBarras);
    @WebMethod String mostrarValor( float valor);
    @WebMethod String cpfNota(String cpfClient);
}
