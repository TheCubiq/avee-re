.class public final Lcom/daaw/ra3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/ma3;

.field public static final b:Lcom/daaw/ma3;

.field public static final c:Lcom/daaw/ma3;

.field public static final d:Lcom/daaw/ma3;

.field public static final e:Lcom/daaw/ma3;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const-string v0, "gads:consent:gmscore:dsid:enabled"

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/na3;->f(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ra3;->a:Lcom/daaw/ma3;

    const-string v0, "gads:consent:gmscore:lat:enabled"

    invoke-static {v0, v1}, Lcom/daaw/na3;->f(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ra3;->b:Lcom/daaw/ma3;

    new-instance v0, Lcom/daaw/na3;

    const-string v2, "gads:consent:gmscore:backend_url"

    const-string v3, "https://adservice.google.com/getconfig/pubvendors"

    const/4 v4, 0x4

    invoke-direct {v0, v2, v3, v4}, Lcom/daaw/na3;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    sput-object v0, Lcom/daaw/ra3;->c:Lcom/daaw/ma3;

    new-instance v0, Lcom/daaw/na3;

    const-wide/16 v2, 0x2710

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "gads:consent:gmscore:time_out"

    const/4 v4, 0x2

    invoke-direct {v0, v3, v2, v4}, Lcom/daaw/na3;-><init>(Ljava/lang/String;Ljava/lang/Object;I)V

    sput-object v0, Lcom/daaw/ra3;->d:Lcom/daaw/ma3;

    const-string v0, "gads:consent:gmscore:enabled"

    invoke-static {v0, v1}, Lcom/daaw/na3;->f(Ljava/lang/String;Z)Lcom/daaw/ma3;

    move-result-object v0

    sput-object v0, Lcom/daaw/ra3;->e:Lcom/daaw/ma3;

    return-void
.end method
