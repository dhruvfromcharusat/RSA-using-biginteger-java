# RSA-using-biginteger-java
I have implemented RSA algorithm using java socket programming and big integer.
# STEP 1
Compile the code both simultaneouslyin to different CMDs(command prompts).
# STEP 2
Run first server side code cause it should be active first to recive request form client.
# STEP 3
will display "Waiting for client in port number 8080(according to my code)"
then run rsaclient and it will establish connection between server and client.
# STEP 4
Now server will ask you two prime numbers 'p' and 'q'.You have to enter prime compulsory.
Then server will calcuate respective n(group) and totient function fi(n).
# STEP 5
It's a important step now you have to enter a public key 'e' which gives g.c.d. WRT fi, 1 or GCD(e,fi)=1. 
We can say that e should be co_prime with totient function fi.
# STEP 6
Server will compute d private key on bases of public key e entered using euclidean extended algorithm logic.
Euclidean extended algorithm will claculate inverse of 'e' in group 'n'.
NOTE: Every element present in the group has a unique inverse element existing.
Now over the socket connection e and n will be shared to client but d is kept restricted to server side and will not be shared over connection.
Now contol is in hand of client so now we have to enter message 'm' in number only(later we can add some new functionality which convert string to ascii code then ascii to biginteger).
Then encryption will be done on client side using formula (m^e)MOD n= cipher text.
# STEP 7
Now cipher text will be shared over the established connection so that unauthorized user can't interpret the data.
Data will be now decrypted using private key 'd' which only server has it so only authorized user can decrypt(extract) the data to human readable form.
Formula for decryption goes, Plaintext=(Ciphertext^d)MOD n.
# TIPS
RSA's security rely on discrete log problem that makes brute force attack very difficult.
Use two very large prime numbers as the security of your message and your system totally depends on n.
Larger the prime better the security.
# REFERENCE
https://simple.wikipedia.org/wiki/RSA_algorithm#:~:text=RSA%20(Rivest%E2%80%93Shamir%E2%80%93Adleman,can%20be%20given%20to%20anyone.


#IMPLEMENTATION SCREENSHOTS.
## EXPERIMENT ONE:
Server side:
![rsaserver](https://user-images.githubusercontent.com/93263533/159744720-41e62cda-e20b-4a6a-8d04-e840ad69f061.jpg)

Client side:
![rsaclient](https://user-images.githubusercontent.com/93263533/159744976-828a4e65-cb47-42a3-af6a-7827489a6466.jpg)

## EXPERIMENT TWO using two very large prime numbers:
Server side:
![rsaserver_2](https://user-images.githubusercontent.com/93263533/159745186-3d241de3-1881-4c99-b560-e82bfee31a67.jpg)

Client side:
![rsaclient_2](https://user-images.githubusercontent.com/93263533/159745260-74f30251-2b09-46ff-8f9e-38c0cc1d8877.jpg)
