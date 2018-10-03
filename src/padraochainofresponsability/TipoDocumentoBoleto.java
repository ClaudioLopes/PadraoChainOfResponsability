package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class TipoDocumentoBoleto implements TipoDocumento{
    private static TipoDocumentoBoleto tipoDocumentoBoleto = new TipoDocumentoBoleto();
    
    public static TipoDocumentoBoleto getTipoDocumentoBoleto(){
        return tipoDocumentoBoleto;
    }
}
