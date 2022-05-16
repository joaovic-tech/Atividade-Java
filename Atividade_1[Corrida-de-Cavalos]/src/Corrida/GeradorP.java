
package Corrida;


/* Classe GeradorP 
 *
 * Esta classe é resposavel por gerar as perguntas que serão
 * lançadas durante o andamento do jogo. 
 * 
 * Instruções de uso:Utilize a classe para extrair as informações sobre
 * as perguntas, como,enumciado,resposta correta e alternativas.
 *
 * Limitações: Deve ser utilizada sempre em conjunto com a classe Jogador
 */
public class GeradorP {
    
    private String enumciado; // Contem o enumciado da pergunta
    private String alternativa; // Contem as alternativas da pergunta
    private String resposta; // Contem a alternativa correta
    
    
    /*
    * Construtor pergunta
    *
    * Realiza a inicalização levando em consideração os parametros que sao repassados
    * durante a criação do objeto na classe Interface.
    *
    * Evita que as variaveis sejam inicializadas com valor "null" 
    */
    public GeradorP(String enu,String alter,String resp){
        enumciado = enu;
        alternativa = alter;
        resposta = resp;
    }
    
    /*
    * Metodo getEnumciado
    *
    * Extrai o enumciado da pergunta
    */
    public String getEnumciado() {
        return enumciado;
    }
    
    /*
    * Metodo setEnumciado
    *
    * Insere o enumciado da pergunta
    */
    public void setEnumciado(String enumciado) {
        this.enumciado = enumciado;
    }
    
    /*
    * Metodo getAlternativa
    *
    * Extrai as possiveis alternativas da pergunta
    */
    public String getAlternativa() {
        return alternativa;
    }
    
    /*
    * Metodo setAlternativa
    *
    * Insere as possiveis alternativas da pergunta
    */
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
    
    /*
    * Metodo getResposta
    *
    * Extrai a unica alternativa correta para a pergunta
    */
    public String getResposta() {
        return resposta;
    }
    
    /*
    * Metodo setResposta
    *
    * Insere a unica alternativa correta para a pergunta
    */
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
     
    
}
