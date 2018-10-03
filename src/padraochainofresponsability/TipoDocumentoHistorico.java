package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class TipoDocumentoHistorico implements TipoDocumento{
    private static TipoDocumentoHistorico tipoDocumentoHistorico = new TipoDocumentoHistorico();
    
    public static TipoDocumentoHistorico getTipoDocumentoHistorico(){
        return tipoDocumentoHistorico;
    }    
}
