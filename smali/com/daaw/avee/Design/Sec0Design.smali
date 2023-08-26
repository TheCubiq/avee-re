.class public Lcom/daaw/avee/Design/Sec0Design;
.super Ljava/lang/Object;
.source "Sec0Design.java"


# instance fields
.field private listenerRefHolder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/daaw/avee/Design/Sec0Design;->listenerRefHolder:Ljava/util/List;

    .line 29
    sget-object v0, Lcom/daaw/avee/Design/IAP2Design;->verifyDeveloperPayload:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/Sec0Design$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/Sec0Design$1;-><init>(Lcom/daaw/avee/Design/Sec0Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/Sec0Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    .line 37
    sget-object v0, Lcom/daaw/avee/Design/IAP2Design;->onPremium:Lcom/daaw/avee/Common/Events/WeakEventR2;

    new-instance v1, Lcom/daaw/avee/Design/Sec0Design$2;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/Sec0Design$2;-><init>(Lcom/daaw/avee/Design/Sec0Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/Sec0Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR2;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR2$Handler;Ljava/util/List;)V

    .line 45
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/util2/BillingManager;->onRequestBase64PublicKey:Lcom/daaw/avee/Common/Events/WeakDelegateR1;

    sget-object v1, Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;->INSTANCE:Lcom/daaw/avee/Design/-$$Lambda$Sec0Design$-ZEqEc4H2plXZPsKSO-8uGdMHyo;

    iget-object v2, p0, Lcom/daaw/avee/Design/Sec0Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakDelegateR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakDelegateR1$Handler;Ljava/util/List;)Lcom/daaw/avee/Common/Events/WeakDelegateR1;

    .line 79
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/util/IabHelper;->requestSignatureBase64:Lcom/daaw/avee/Common/Events/WeakEventR1;

    new-instance v1, Lcom/daaw/avee/Design/Sec0Design$3;

    invoke-direct {v1, p0}, Lcom/daaw/avee/Design/Sec0Design$3;-><init>(Lcom/daaw/avee/Design/Sec0Design;)V

    iget-object v2, p0, Lcom/daaw/avee/Design/Sec0Design;->listenerRefHolder:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/avee/Common/Events/WeakEventR1;->subscribeWeak(Lcom/daaw/avee/Common/Events/WeakEventR1$Handler;Ljava/util/List;)V

    return-void
.end method

.method static synthetic lambda$new$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/String;

    const-string v2, "NIIBIjANBgk"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v4, "mM7QIDAQAB"

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const-string v4, "QEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH"

    const/4 v6, 0x2

    aput-object v4, v1, v6

    const-string v4, "Bs"

    const/4 v7, 0x3

    aput-object v4, v1, v7

    new-array v4, v0, [Ljava/lang/String;

    aput-object v2, v4, v3

    const-string v2, "qhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH1aPnlAozdrEl4l6wexfq8SNhI4ivGLRYYjIZC4VIT/aXfOHJh7fsG"

    aput-object v2, v4, v5

    const-string v2, "wexfq8SNhI4ivGLRYYjIZC4VIT/a"

    aput-object v2, v4, v6

    const-string v2, "kq"

    aput-object v2, v4, v7

    new-array v2, v0, [Ljava/lang/String;

    const-string v8, "8b/6GSIc9p3IvY"

    aput-object v8, v2, v3

    const-string v8, "D1mQ9V67Q"

    aput-object v8, v2, v5

    const-string v8, "o0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls"

    aput-object v8, v2, v6

    const-string v8, "Q8"

    aput-object v8, v2, v7

    new-array v8, v0, [Ljava/lang/String;

    const-string v9, "+hZ/oOkTg2B7jGyLmbS9dXgLcJ"

    aput-object v9, v8, v3

    const-string v9, "+hZ/oOkTg2B7jGyLmbS9dXgLcJ2A/JiqUVWdrsLP88UYuOCbq"

    aput-object v9, v8, v5

    const-string v9, "k1FIo0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls9LW"

    aput-object v9, v8, v6

    const-string v9, "qk"

    aput-object v9, v8, v7

    new-array v9, v0, [Ljava/lang/String;

    const-string v10, "rzPHcrixoclj2Pt1sv4m0ibYd1S8"

    aput-object v10, v9, v3

    const-string v10, "8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES"

    aput-object v10, v9, v5

    const-string v11, "pMzf1dKvxoofxoOMnx9ITN6u8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES"

    aput-object v11, v9, v6

    const-string v11, "8p"

    aput-object v11, v9, v7

    const/4 v11, 0x5

    new-array v12, v11, [Ljava/lang/String;

    const-string v13, "+NdJ6hZSWwzcDUoHEwdn5FtiUk04LiJ8/7BeXDyES/xACbcT2J3"

    aput-object v13, v12, v3

    aput-object v10, v12, v5

    const-string v10, "50IQ0I47mM7QIDAQAB"

    aput-object v10, v12, v6

    const-string v10, "xoofxoOMnx9ITN6u8KJbDnF"

    aput-object v10, v12, v7

    const-string v10, "35"

    aput-object v10, v12, v0

    .line 56
    aget-object v10, v1, v3

    aget-object v1, v1, v5

    new-array v11, v11, [[Ljava/lang/String;

    aput-object v4, v11, v3

    aput-object v2, v11, v5

    aput-object v8, v11, v6

    aput-object v9, v11, v7

    aput-object v12, v11, v0

    invoke-static {v10, v1, v11}, Lcom/daaw/avee/comp/InAppBilling/BSecPub;->decPart1(Ljava/lang/String;Ljava/lang/String;[[Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 57
    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/BSecPub;->decPart2(Ljava/util/List;)Ljava/util/List;

    .line 59
    invoke-static {v0}, Lcom/daaw/avee/comp/InAppBilling/BSecPub;->decPart3(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .line 63
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result p0

    aput-char p0, v0, v3

    .line 64
    invoke-static {v0}, Ljava/lang/String;->valueOf([C)Ljava/lang/String;

    move-result-object p0

    const-string v0, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAn6rIjxdIvNH1aPnlAozdrEl4l6wexfq8SNhI4ivGLRYYjIZC4VIT/aXfOHJh7fsGD1mQ9V67Q8b/6GSIc9p3IvY+hZ/oOkTg2B7jGyLmbS9dXgLcJ2A/JiqUVWdrsLP88UYuOCbqk1FIo0i12PBXsxn7troWnLBgNYbQt8UIRv5PVP4H3roIxt2w5gls9LWrzPHcrixoclj2Pt1sv4m0ibYd1S8pMzf1dKvxoofxoOMnx9ITN6u8KJbDnF6RMMstOj6DFzlHbUmkphNObjfgaES+NdJ6hZSWwzcDUoHEwdn5FtiUk04LiJ8/7BeXDyES/xACbcT2J350IQ0I47mM7QIDAQAB"

    .line 69
    invoke-static {v0, p0}, Ljunit/framework/Assert;->assertEquals(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method
