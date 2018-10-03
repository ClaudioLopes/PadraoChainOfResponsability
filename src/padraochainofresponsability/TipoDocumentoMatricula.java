package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class TipoDocumentoMatricula implements TipoDocumento{
    private static TipoDocumentoMatricula tipoDocumentoMatricula = new TipoDocumentoMatricula();
    
    public static TipoDocumentoMatricula getTipoDocumentoMatricula(){
        return tipoDocumentoMatricula;
    }    
}
