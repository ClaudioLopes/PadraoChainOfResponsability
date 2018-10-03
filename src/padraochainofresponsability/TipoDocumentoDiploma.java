package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class TipoDocumentoDiploma implements TipoDocumento{
    private static TipoDocumentoDiploma tipoDocumentoDiploma = new TipoDocumentoDiploma();
    
    public static TipoDocumentoDiploma getTipoDocumentoDiploma(){
        return tipoDocumentoDiploma;
    }
}
