import java.util.Scanner;

public class MiniProjeto1 {
    public static void main(String[] args) {


        System.out.println(" LUMINUS' FATE\n");
        String cap1 = " Muito tempo atrás todos os seres - místicos ou não - viviam em harmonia. Isso mudou\n quando a ganância dos humanos cegou suas atitudes, fazendo com que as diferenças e\n um interesse específico dividisse os povos em dois mundos: Etheria e Arcanum, onde\n habitam, respectivamente, os humanos e os nympharis (seres místicos). A divisão foi\n influenciada pela posse da éter primordial - jóia destinada a ficar sob o cuidado dos\n nympharis - e antes da separação dos dois mundos se concretizar, os humanos roubaram\n a jóia.\n\n Essa história foi distorcida pelos humanos, a nobreza em específico, para que dessa\n forma continuassem com a éter sob seu domínio. Os cidadãos de Etheria, devotos de sua\n terra, acreditam fielmente que a jóia sempre foi destinada a eles e que os nympharis\n querem roubá-la. Luminus, um humano curioso e questionador decide que seu objetivo é\n trazer de volta a harmonia entre os reinos após ouvir a história contada por seu avô: A\n história dos guardiões dos segredos de Arcanum (que por acaso é a história real, mas que\n todos os outros acreditam ser um rumor). Seu objetivo cresceu cada vez mais com o\n passar do tempo, pois ele enxergava como os humanos e nympharis se degradavam -\n invasões em vilas e mortes brutais, tanto de humanos como de nympharis (alguns ficaram\n em Etheria, assim como alguns humanos se adaptaram a Arcanum).\n";
        String cap2 = " Depois de muito explorar a floresta, Luminus finalmente encontra a raposa. Ela é\n responsável por proteger a árvore do tempo. Após um bom diálogo com Ruby, foi dito que\n é necessário que ele busque a solução de tudo no passado e, só assim, será revelado o\n local que se encontra a éter primordial. Para isso ele terá de entrar na árvore do tempo:\n Para isso ele terá de vagar na árvore do tempo\n";
        String cap3 = " Após conhecer o corvo da fortuna ou Colossus o metamorfo, Luminus foi sentenciado a,\n caso queira receber a éter primordial - de alguma forma Colossus tem acesso a\n informação necessária - , ele deve assumir a sua forma humana e descobrir através das\n alianças a localização da éter, de forma que Colossus o ajude no processo.\n Luminus, gostaria de sugerir que os dois trabalhassem em conjunto com Ruby, a guardiã\n da floresta.\n ";
        String final1 = " Luminus entra na sala que contém um vitral enorme e de uma beleza nunca vista por ele\n antes. Luminus não percebe em primeiro momento, mas o vitral parece contar uma história:\n chamas verdes, azuis e amarelas mexem-se, dançam, hipnotizam e circundam os\n olhos dele. De repente, tudo faz sentido. O vitral é a materialização da história de seu\n mundo, quando não havia Etheria ou Arcanum, Luminus agora possui um conhecimento tão\n puro quanto a luz das chamas do vitral, que agora incendeiam sua próxima ação. Ele\n está decidido a encontrar a éter primordial, agora que os vitrais retiraram o véu dos\n seus olhos, ele detém o conhecimento necessário para recuperar a éter e devolvê-la ao seu\n devido lugar. No entanto, ele deve entregá-la a raposa, de forma que ele assuma o\n lugar de guardião da floresta. A raposa pode finalmente voltar para seu mundo.\n\n  Fim";
        String final2 = " Uma luz chama atenção de Luminus, ele a segue e acaba chegando em um portal: o portal\n das raízes do tempo. A raposa diz que entrar lá é um ato de grande\n responsabilidade e que a condição imposta para quem adentra Arcanum é nunca mais sair.\n Luminus, motivado por sua vontade de restaurar a harmonia entre os mundos, se\n sente confiante em tentar, afinal ele sempre gostou quando seu avô contava histórias sobre\n o mundo místico. Ao entrar em Arcanum, Luminus se surpreende com o mundo que\n está diante de si. Lá ele vivencia o passado, antes da divisão dos mundos. Vivencia\n também conflitos brutais, influenciados pelo orgulho e ganância, mas apesar disso ele\n consegue entrar em contato com a raposa em um período em que ela ainda não era guardiã\n da floresta e faz uma estratégia para voltar ao presente e recuperar a éter\n primordial. Luminus então retorna ao presente e recupera a jóia, mas como cruzou os\n limites entre Arcanum e Etheria, ele não pode mais viver no mundo dos humanos e passa a\n viver o resto de sua vida em Arcanum.\n\n Fim.";
        String final3 = " Luminus inicia sua busca pela éter primordial junto a Colossus, fazendo negociações aqui\n e ali e na busca incessante de segredos que envolvam a éter primordial.\n\n Fim.";
        String final4 = " Luminus sugere ao corvo, que apesar da aversão a Ruby, trabalhe em conjunto com eles para/nencontrar a éter primordial e restaurar a situação atual do mundo. Colossus antes de\n aceitar, pede em troca que Luminus descubra o paradeiro de um caçador de metamorfos.\n\n Fim.";


        System.out.println(cap1); // apresentação da história


        // escolha entre raposa (a) e corvo(b)
        System.out.println("Luminus deve decidir qual guardião procurar\n"
        + "digite 'a' para procurar a raposa\n" + "digite 'b' para procurar o corvo");
        Scanner scanner = new Scanner(System.in);
        String escolhaGuardiao = scanner.nextLine();
       
        if(escolhaGuardiao.equals("a")){
            System.out.println(cap2);
            System.out.println("Digite 1 para observar as raízes do tempo e descobrir\n a localização do éter primordial.\n\n Digite 2 para teleportar para o passado e corrgir a ganância dos humanos. ");
            int escolhaRaposa = scanner.nextInt();
            if (escolhaRaposa == 1){
                System.out.println(final1); // final 1
            } else if (escolhaRaposa == 2) {
                System.out.println(final2); // final 2
            } else {
                System.out.println("erro, refaça o percusso da leitutra e faça a escolha atentamente");
            }


        } else if (escolhaGuardiao.equals("b")) {
            System.out.println(cap3);
            System.out.println("Digite 1 para trabalha em conjunto com Colossus ou digite 2 para fazer a sugestão");
            int escolhaCorvo = scanner.nextInt();


            if(escolhaCorvo == 1){
                System.out.println(final3);
            } else if (escolhaCorvo == 2){
                System.out.println(final4);
            } else {
                System.out.println("erro, refaça o percusso da leitura e faça a escolha atentamente!");
            }


        }
   
        scanner.close();


    }
}
