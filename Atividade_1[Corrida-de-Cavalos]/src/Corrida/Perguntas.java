
package Corrida;

import java.util.HashMap;

/*
* Classe Perguntas
* 
* Esta classe e responsavel por armazenar as perguntas criadas,gerar um mecanismo
* que lança aleatoriamente para o jogador,calcula e armazena os acertos e erros.
*/

public class Perguntas {

    HashMap hashPerguntas; // Hashmap responsavel por armazenar as perguntas
    
    
    /*
    * Construtor Perguntas;
    * 
    * Trabalhando em conjunto com uma variavel de referencia do tipo HashMap o
    * construtor inicializa a construção das perguntas com todas as informações
    * necessarias
    *
    * Evita que os objeto sejam atribuidos com valores "null"
    */
    public Perguntas(){
        hashPerguntas = new HashMap();
        
        GeradorP p1 = new GeradorP("O que é, o que é? Feito para andar e não anda",
            "a)Rua  b)Vento   c)Carro   d)Gato","a");
        
        GeradorP p2 = new GeradorP("O que é, o que é? Vive no mar mais não se molha",
            "a)Algas   b)Sombra   c)Água  d)Peixe ","b");
        
               GeradorP p3 = new GeradorP("O que é, o que é? Mantém sempre o mesmo tamanho, não importa o peso",
            "a)Altura   b)Objetos c)Balança d)Gorgura","c");
        
        GeradorP p4 = new GeradorP("O que é, o que é? Uma casinha sem porta e sem janela",
            "a)País  b)Cidade  c)Apartamento  d)Ovo","d");
        
        GeradorP p5 = new GeradorP("O que é, o que é? De dia tem quatro pés e de noite tem seis.",
            "a)Cama  b)Elefante  c)Restaurante  d)Aranha","a");
        
        GeradorP p6 = new GeradorP("O que é, o que é? Anda deitado e dorme em pé",
            "a)Bengala  b)Cachorro  c)Pé  d)Pessoa","c");
        
        GeradorP p7 = new GeradorP("O que é, o que é? O gafanhoto traz na frente e a pulga traz atrás",
            "a)Asa  b)A sílaba (ga)  c)Pelo  d)Folha","b");
        
         GeradorP p8 = new GeradorP("O que é, o que é? Tem um palmo de pescoço, tem barriga e não tem osso",
            "a)garrafa  b)tipada  c)flexivel  d)engessada","a");
         
         GeradorP p9 = new GeradorP("O que é, o que é? Quebra quando se fala",
            "a)Pulmão  b)Língua  c)Boca  d)Segredo","d");
         
         GeradorP p10 = new GeradorP("O que é, o que é? Nasce branco, fica verde, depois fica vermelho e acaba preto",
            "a)Café  b)Churrasco  c)Passáro  d)Bola","a");
         
         
        
        hashPerguntas.put(1,p1);
        hashPerguntas.put(2,p2);
        hashPerguntas.put(3,p3);
        hashPerguntas.put(4,p4);
        hashPerguntas.put(5,p5);
        hashPerguntas.put(6,p6);
        hashPerguntas.put(7,p7);
        hashPerguntas.put(8,p8); 
        hashPerguntas.put(9,p9);
        hashPerguntas.put(10,p10);     
    }
    
    /*
    * Metodo getHashPerguntas
    *
    * Extrai as informações das pergunta, retorna um objeto que contem todas as
    * informaçoes necessarias sobre a pergunta
    */
    public HashMap getHashPerguntas() {
        return hashPerguntas;
    }
    
    
    /*
    * Metodo setHashPerguntas
    *
    * Insere as informações das perguntas na forma de um objeto
    * 
    */
    public void setHashPerguntas(HashMap hashPerguntas) {
        this.hashPerguntas = hashPerguntas;
    }
   
}
