package valores;

interface ValoresITF {
	boolean ins(int v);// insere um valor
	int del(int i); // remove/retorna valor indice i
	int size(); // retorna qtdade valores armazenados
	double mean(); // retorna média valores armazenados
	int greater(); // retorna maior valor armazenado
	int lower(); // retorna o menor valor armazenado
}
