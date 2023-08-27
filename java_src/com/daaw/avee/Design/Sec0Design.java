package com.daaw.avee.Design;

import com.android.billingclient.api.Purchase;
import com.daaw.avee.Common.Events.WeakDelegateR1;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.comp.InAppBilling.BSecPub;
import com.daaw.avee.comp.InAppBilling.util.IabHelper;
import com.daaw.avee.comp.InAppBilling.util2.BillingManager;
import java.util.ArrayList;
import java.util.List;
import junit.framework.Assert;
/* loaded from: classes.dex */
public class Sec0Design {
    private List<Object> listenerRefHolder = new ArrayList(1);

    public Sec0Design() {
        IAP2Design.verifyDeveloperPayload.subscribeWeak(new WeakEventR1.Handler<Purchase, Boolean>() { // from class: com.daaw.avee.Design.Sec0Design.1
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(Purchase purchase) {
                return Boolean.valueOf(purchase != null);
            }
        }, this.listenerRefHolder);
        IAP2Design.onPremium.subscribeWeak(new WeakEventR2.Handler<Purchase, Boolean, Boolean>() { // from class: com.daaw.avee.Design.Sec0Design.2
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public Boolean invoke(Purchase purchase, Boolean bool) {
                return Boolean.valueOf(purchase != null);
            }
        }, this.listenerRefHolder);
        BillingManager.onRequestBase64PublicKey.subscribeWeak(new WeakDelegateR1.Handler() { // from class: com.daaw.avee.Design.-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo
            @Override // com.daaw.avee.Common.Events.WeakDelegateR1.Handler
            public final Object invoke(Object obj) {
                return Sec0Design.lambda$new$0((String) obj);
            }
        }, this.listenerRefHolder);
        IabHelper.requestSignatureBase64.subscribeWeak(new WeakEventR1.Handler<String[], String>() { // from class: com.daaw.avee.Design.Sec0Design.3
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public String invoke(String[] strArr) {
                String[] strArr2 = {"NIIBIjANBgk", "mM7QIDAQAB", "QEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH", "Bs"};
                List<String> decPart1 = BSecPub.decPart1(strArr2[0], strArr2[1], new String[]{"NIIBIjANBgk", "qhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH1aPnlAozdrEl4l6wexfq8SNhI4ivGLRYYjIZC4VIT/aXfOHJh7fsG", "wexfq8SNhI4ivGLRYYjIZC4VIT/a", "kq"}, new String[]{"8b/6GSIc9p3IvY", "D1mQ9V67Q", "o0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls", "Q8"}, new String[]{"+hZ/oOkTg2B7jGyLmbS9dXgLcJ", "+hZ/oOkTg2B7jGyLmbS9dXgLcJ2A/JiqUVWdrsLP88UYuOCbq", "k1FIo0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls9LW", "qk"}, new String[]{"rzPHcrixoclj2Pt1sv4m0ibYd1S8", "8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES", "pMzf1dKvxoofxoOMnx9ITN6u8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES", "8p"}, new String[]{"+NdJ6hZSWwzcDUoHEwdn5FtiUk04LiJ8/7BeXDyES/xACbcT2J3", "8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES", "50IQ0I47mM7QIDAQAB", "xoofxoOMnx9ITN6u8KJbDnF", "35"});
                BSecPub.decPart2(decPart1);
                char[] charArray = BSecPub.decPart3(decPart1).toCharArray();
                charArray[0] = strArr[0].charAt(0);
                return String.valueOf(charArray);
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String lambda$new$0(String str) {
        String[] strArr = {"NIIBIjANBgk", "mM7QIDAQAB", "QEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH", "Bs"};
        List<String> decPart1 = BSecPub.decPart1(strArr[0], strArr[1], new String[]{"NIIBIjANBgk", "qhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH1aPnlAozdrEl4l6wexfq8SNhI4ivGLRYYjIZC4VIT/aXfOHJh7fsG", "wexfq8SNhI4ivGLRYYjIZC4VIT/a", "kq"}, new String[]{"8b/6GSIc9p3IvY", "D1mQ9V67Q", "o0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls", "Q8"}, new String[]{"+hZ/oOkTg2B7jGyLmbS9dXgLcJ", "+hZ/oOkTg2B7jGyLmbS9dXgLcJ2A/JiqUVWdrsLP88UYuOCbq", "k1FIo0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls9LW", "qk"}, new String[]{"rzPHcrixoclj2Pt1sv4m0ibYd1S8", "8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES", "pMzf1dKvxoofxoOMnx9ITN6u8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES", "8p"}, new String[]{"+NdJ6hZSWwzcDUoHEwdn5FtiUk04LiJ8/7BeXDyES/xACbcT2J3", "8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES", "50IQ0I47mM7QIDAQAB", "xoofxoOMnx9ITN6u8KJbDnF", "35"});
        BSecPub.decPart2(decPart1);
        char[] charArray = BSecPub.decPart3(decPart1).toCharArray();
        charArray[0] = str.charAt(0);
        String valueOf = String.valueOf(charArray);
        Assert.assertEquals("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH1aPnlAozdrEl4l6wexfq8SNhI4ivGLRYYjIZC4VIT/aXfOHJh7fsGD1mQ9V67Q8b/6GSIc9p3IvY+hZ/oOkTg2B7jGyLmbS9dXgLcJ2A/JiqUVWdrsLP88UYuOCbqk1FIo0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls9LWrzPHcrixoclj2Pt1sv4m0ibYd1S8pMzf1dKvxoofxoOMnx9ITN6u8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES+NdJ6hZSWwzcDUoHEwdn5FtiUk04LiJ8/7BeXDyES/xACbcT2J350IQ0I47mM7QIDAQAB", valueOf);
        return valueOf;
    }
}
