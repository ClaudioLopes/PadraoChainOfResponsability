package padraochainofresponsability;

/**
 *
 * @author claudio
 */
public class PadraoChainOfResponsability {

    public static void main(String[] args) {
        FuncionarioReitor reitor = new FuncionarioReitor(null);
        FuncionarioDiretor diretor = new FuncionarioDiretor(reitor);
        FuncionarioCoordenador coordenador = new FuncionarioCoordenador(diretor);
        FuncionarioSecretaria secretaria = new FuncionarioSecretaria(coordenador);
        
        System.out.println(secretaria.assinarDocumento(new Documento(TipoDocumentoHistorico.getTipoDocumentoHistorico())));
        System.out.println(secretaria.assinarDocumento(new Documento(TipoDocumentoMatricula.getTipoDocumentoMatricula())));
        System.out.println(secretaria.assinarDocumento(new Documento(TipoDocumentoCertificado.getTipoDocumentoCertificado())));
        System.out.println(secretaria.assinarDocumento(new Documento(TipoDocumentoDiploma.getTipoDocumentoDiploma())));
        System.out.println(secretaria.assinarDocumento(new Documento(TipoDocumentoBoleto.getTipoDocumentoBoleto())));
    }
    
}
