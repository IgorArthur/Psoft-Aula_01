import interFace.MainInterface;

class Main {
    public static void main(String[] args) throws Exception {
        MainInterface mainInterface = new MainInterface();

        mainInterface.init();
    }

}


// O sistema deve permitir a operação de criar produtos considerando nome, fabricante e preço;
// O sistema deve permitir a operação de criar lotes considerando produto, quantidade e data de validade;
// O sistema deve permitir a operação de listar produtos;
// O sistema deve permitir a operação de listar lotes ;