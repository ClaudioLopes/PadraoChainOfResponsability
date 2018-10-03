package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class TipoDocumentoCertificado implements TipoDocumento {
    private static TipoDocumentoCertificado tipoDocumentoCertificado = new TipoDocumentoCertificado();
    
    public static TipoDocumentoCertificado getTipoDocumentoCertificado(){
        return tipoDocumentoCertificado;
    }
}
