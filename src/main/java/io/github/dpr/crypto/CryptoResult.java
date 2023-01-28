package io.github.dpr.crypto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author eleven
 * @date 2022年06月02日 4:10 PM
 * @see
 * @since
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CryptoResult {
    public String signature;
    public String publicKey;
    public String privateKey;
    public String hash;
    public boolean booleanResult;
    public String encryptedData;
    public String decryptedData;
    public String vrfProof;
    public String wedprErrorMessage;
}
