package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class FuncionarioSecretaria extends Funcionario{
    public FuncionarioSecretaria(Funcionario superior){
        listaDocumentos.add(TipoDocumentoHistorico.getTipoDocumentoHistorico());
        setFuncionarioSuperior(superior);
    }
    
    public String getDescricaoCargo(){
        return "Secretaria";
    }       
}
