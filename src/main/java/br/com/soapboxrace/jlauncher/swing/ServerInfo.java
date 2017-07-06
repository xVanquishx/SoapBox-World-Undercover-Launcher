/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.soapboxrace.jlauncher.swing;

import java.util.ResourceBundle;
import java.util.Locale;

import br.com.soapboxrace.jlauncher.vo.ServerInfoVO;
import com.google.gson.Gson;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author Vanquish
 */
public class ServerInfo extends javax.swing.JFrame {

    private ResourceBundle Text = ResourceBundle.getBundle("locales.locale", Locale.getDefault());

    /**
     * @param args the command line arguments
     */
    private static OkHttpClient client = new OkHttpClient();

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
    }

    public static String getJSON(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        return response.body().string();
    }

    /**
     * Creates new form ServerInfo
     *
     * @param URL
     */
    public ServerInfo(String URL) {
        String json = null;
        try {
            json = getJSON(URL + "/soapbox-race-core/Engine.svc/GetServerInformation");
        } catch (IOException e) {
        }

        Gson gson = new Gson();

        ServerInfoVO serverInfo = gson.fromJson(json, ServerInfoVO.class);
        initComponents();
        serverName.setText(serverInfo.getServerName());
        serverDescription.setText(serverInfo.getMessageSrv());
        serverLocation.setText(serverInfo.getCountry());
        usersOnline.setText(serverInfo.getOnlineNumber());
        usersRegistered.setText(serverInfo.getNumberOfRegistered());
        ownerList.setText(serverInfo.getOwnerList());
        adminList.setText(serverInfo.getAdminList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        serverNameLabel = new javax.swing.JLabel();
        serverName = new javax.swing.JLabel();
        serverDescriptionLabel = new javax.swing.JLabel();
        serverDescription = new javax.swing.JLabel();
        serverLocationLabel = new javax.swing.JLabel();
        serverLocation = new javax.swing.JLabel();
        usersOnlineLabel = new javax.swing.JLabel();
        usersOnline = new javax.swing.JLabel();
        usersRegisteredLabel = new javax.swing.JLabel();
        usersRegistered = new javax.swing.JLabel();
        ownerListLabel = new javax.swing.JLabel();
        ownerList = new javax.swing.JLabel();
        adminList = new javax.swing.JLabel();
        adminListLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Server Information");

        serverNameLabel.setText("<html><b>" + Text.getString("info.server.name") + "</b></html>");

        serverName.setText("W.I.P");

        serverDescriptionLabel.setText("<html><b>" + Text.getString("info.server.description") + "</b></html>");

        serverDescription.setText("W.I.P");

        serverLocationLabel.setText("<html><b>" + Text.getString("info.server.location") + "</b></html>");

        serverLocation.setText("W.I.P");

        usersOnlineLabel.setText("<html><b>" + Text.getString("info.online.users") + "</b></html>");

        usersOnline.setText("W.I.P");

        usersRegisteredLabel.setText("<html><b>" + Text.getString("info.registered.users") + "</b></html>");

        usersRegistered.setText("W.I.P");

        ownerListLabel.setText("<html><b>" + Text.getString("info.owner.names") + "</b></html>");

        ownerList.setText("W.I.P");

        adminList.setText("W.I.P");

        adminListLabel.setText("<html><b>" + Text.getString("info.admin.list") + "</b></html>");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usersRegistered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ownerListLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverNameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ownerList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adminListLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersOnlineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersOnline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usersRegisteredLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
                    .addComponent(serverDescriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serverLocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverName)
                .addGap(13, 13, 13)
                .addComponent(serverDescriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverDescription)
                .addGap(18, 18, 18)
                .addComponent(serverLocationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serverLocation)
                .addGap(16, 16, 16)
                .addComponent(usersOnlineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersOnline)
                .addGap(18, 18, 18)
                .addComponent(usersRegisteredLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usersRegistered)
                .addGap(18, 18, 18)
                .addComponent(ownerListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ownerList)
                .addGap(18, 18, 18)
                .addComponent(adminListLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminList;
    private javax.swing.JLabel adminListLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel ownerList;
    private javax.swing.JLabel ownerListLabel;
    private javax.swing.JLabel serverDescription;
    private javax.swing.JLabel serverDescriptionLabel;
    private javax.swing.JLabel serverLocation;
    private javax.swing.JLabel serverLocationLabel;
    private javax.swing.JLabel serverName;
    private javax.swing.JLabel serverNameLabel;
    private javax.swing.JLabel usersOnline;
    private javax.swing.JLabel usersOnlineLabel;
    private javax.swing.JLabel usersRegistered;
    private javax.swing.JLabel usersRegisteredLabel;
    // End of variables declaration//GEN-END:variables
}