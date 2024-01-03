import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hotel Booking System");
        JLabel namelb = new JLabel("Person name :");
        namelb.setBounds(20, 30, 120, 40);
        JTextField nametf = new JTextField();
        nametf.setBounds(130, 30, 180, 30);

        JLabel emailidlb = new JLabel("Email Id :");
        emailidlb.setBounds(20, 70, 120, 40);
        JTextField emailidtf = new JTextField();
        emailidtf.setBounds(130, 70, 180, 30);

        JLabel mobilelb = new JLabel("Mobile no. :");
        mobilelb.setBounds(20, 110, 120, 40);
        JTextField mobiletf = new JTextField();
        mobiletf.setBounds(130, 110, 180, 30);

        JLabel addresslb = new JLabel("Address :");
        addresslb.setBounds(20, 150, 120, 40);
        JTextField addresstf = new JTextField();
        addresstf.setBounds(130, 150, 180, 30);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(30, 250, 120, 50);

        JButton bookNowBtn = new JButton("Book Now");
        bookNowBtn.setBounds(200, 250, 120, 50);

        JButton exitBtn = new JButton("Exit");
        exitBtn.setBounds(370, 250, 120, 50);

        JLabel bookingIdlb = new JLabel();
        bookingIdlb.setBounds(150, 350, 300, 40);


        JLabel checkoutDatelb, checkinDatelb, genderlb, amountlb;
        JTextField checkoutDatetf, checkinDatetf, gendertf, amounttf;
        checkoutDatelb = new JLabel("Checkout Date :");
        checkinDatelb = new JLabel("Checkin Date :");
        amountlb = new JLabel("Payment :");
        genderlb = new JLabel("Gender :");

        checkoutDatetf = new JTextField();
        checkinDatetf = new JTextField();
        amounttf = new JTextField();
        gendertf = new JTextField();

        checkoutDatelb.setBounds(320, 30, 150, 40);
        checkinDatelb.setBounds(320, 70, 150, 40);
        amountlb.setBounds(320, 110, 150, 40);
        genderlb.setBounds(320, 150, 150, 40);

        checkoutDatetf.setBounds(450, 30, 180, 30);
        checkinDatetf.setBounds(450, 70, 180, 30);
        amounttf.setBounds(450, 110, 180, 30);
        gendertf.setBounds(450, 150, 180, 30);



        frame.add(namelb);
        frame.add(emailidlb);
        frame.add(mobilelb);
        frame.add(addresslb);
        frame.add(clearBtn);
        frame.add(bookNowBtn);
        frame.add(exitBtn);
        frame.add(bookingIdlb);
        frame.add(nametf);
        frame.add(emailidtf);
        frame.add(mobiletf);
        frame.add(addresstf);
        frame.add(checkoutDatelb);
        frame.add(checkinDatelb);
        frame.add(amountlb);
        frame.add(genderlb);
        frame.add(checkoutDatetf);
        frame.add(checkinDatetf);
        frame.add(amounttf);
        frame.add(gendertf);




        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(800, 600);
        frame.setVisible(true);

        bookNowBtn.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(nametf.getText().toString().isEmpty()||emailidtf.getText().toString().isEmpty()||
                        mobiletf.getText().toString().isEmpty()||amounttf.getText().toString().isEmpty())
                {
                    bookingIdlb.setText("Please fill the complete details");
                }
                else {

                    Random random = new Random();
                    int id = random.nextInt(99999);
                    bookingIdlb.setText("Your booking is confirmed and booking ID " + id);
                }
            }
        });


    }
}