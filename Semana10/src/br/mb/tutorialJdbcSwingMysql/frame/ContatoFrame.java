package br.mb.tutorialJdbcSwingMysql.frame;

import br.mb.tutorialJdbcSwingMysql.controller.ContatoController;
import br.mb.tutorialJdbcSwingMysql.model.Contato;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ContatoFrame extends JFrame {

    private JLabel lbNome, lbApelido, lbDtNascimento;
    private JTextField txtNome, txtApelido, txtDtNascimento;
    private JButton btnSalvar, btnAlterar, btnExcluir;

    private List contatoList = new ContatoController().listaContatos();
    private int registroAtual = 0;
	private Long key;

    public ContatoFrame() {
        super("Contatos");
        Container tela = getContentPane();
        getContentPane().setLayout(null);
        lbNome = new JLabel("Nome");
        lbApelido = new JLabel("Apelido");
        lbDtNascimento = new JLabel("Data de Nascimento(dd/mm/aaaa)");

        lbNome.setBounds(10, 10, 240, 15);
        lbApelido.setBounds(10, 50, 240, 15);
        lbDtNascimento.setBounds(10, 90, 240, 15);

        lbNome.setForeground(Color.BLACK);
        lbApelido.setForeground(Color.BLACK);
        lbDtNascimento.setForeground(Color.BLACK);

        lbNome.setFont(new Font("Courier New", Font.BOLD, 14));
        lbApelido.setFont(new Font("Courier New", Font.BOLD, 14));
        lbDtNascimento.setFont(new Font("Courier New", Font.BOLD, 14));

        tela.add(lbNome);
        tela.add(lbApelido);
        tela.add(lbDtNascimento);

        txtNome = new JTextField();
        txtApelido = new JTextField();
        txtDtNascimento = new JTextField();

        txtNome.setBounds(10, 25, 265, 20);
        txtApelido.setBounds(10, 65, 265, 20);
        txtDtNascimento.setBounds(10, 105, 265, 20);

        tela.add(txtNome);
        tela.add(txtApelido);
        tela.add(txtDtNascimento);

        btnSalvar = new JButton("Salvar");
        btnAlterar = new JButton("Alterar");
        btnExcluir = new JButton("Excluir");

        btnSalvar.setBounds(280, 25, 80, 20);
        btnAlterar.setBounds(280, 65, 80, 20);
        btnExcluir.setBounds(280, 105, 80, 20);

        tela.add(btnSalvar);
        tela.add(btnAlterar);
        tela.add(btnExcluir);

        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);

        btnSalvar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onClickSalvar();
                    }
                }
        );

        btnAlterar.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onClickAlterar();
                    }
                }
        );

        btnExcluir.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        onClickExcluir();
                    }
                }
        );
    }

    private void getValores(int index) {
        if (index <= contatoList.size() - 1) {
            Contato contatoAtual = contatoList.get(index);
            txtNome.setText(contatoAtual.getNome());
            txtApelido.setText(contatoAtual.getApelido());
            txtDtNascimento.setText(
				new SimpleDateFormat("dd/MM/yyyy").format(contatoAtual.getDtNascimento())
			);
        }
    }

    private void onClickAlterar() {
        ContatoController cc = new ContatoController();
       
		long id = 0L;
		
		if (key == null) {
            id = contatoList.get(registroAtual).getId();
        } else {
            id = key;
            key = null;
        }
		
        try {
            cc.alterar(id, txtNome.getText(), txtApelido.getText(), txtDtNascimento.getText());
            JOptionPane.showMessageDialog(this, "Contato alterado com sucesso!");
            clearFields();
            contatoList = new ContatoController().listaContatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Nao foi possivel alterar contato!n" + e.getLocalizedMessage());
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Data possui formato inválido!n" + e.getLocalizedMessage());
        }
    }

    private void onClickSalvar() {
        ContatoController cc = new ContatoController();
        try {
            cc.salvar(txtNome.getText(), txtApelido.getText(), txtDtNascimento.getText());
            JOptionPane.showMessageDialog(this, "Contato salvo com sucesso!");
            clearFields();
            contatoList = new ContatoController().listaContatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
				"Nao foi possivel salvar contato!n" + 
				e.getLocalizedMessage()
			);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, 
				"Data possui formato inválido!n" + 
				e.getLocalizedMessage()
		);
        }
    }

    private void onClickExcluir() {
        ContatoController cc = new ContatoController();
        long id = contatoList.get(registroAtual).getId();
        try {
            cc.excluir(id);
            JOptionPane.showMessageDialog(this, "Contato excluido com sucesso!");
            clearFields();
            contatoList = new ContatoController().listaContatos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, 
				"Nao foi possivel excluir o contato!n" + 
				e.getLocalizedMessage()
			);
        }
    }

    private void clearFields() {
        txtNome.setText("");
        txtApelido.setText("");
        txtDtNascimento.setText("");
        txtLocalizar.setText("");
    }

    public static void main(String[] args) {
        ContatoFrame frame = new ContatoFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}