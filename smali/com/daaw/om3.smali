.class public final Lcom/daaw/om3;
.super Lcom/daaw/p04;
.source ""


# instance fields
.field public final b:Lcom/daaw/nm3;


# direct methods
.method public constructor <init>(Lcom/daaw/nm3;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/daaw/p04;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/daaw/om3;->b:Lcom/daaw/nm3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/String;)Z
    .locals 2

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "LeibnizHttpUrlPinger pinging URL: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v1, "oda"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const-string v0, "URL does not match oda:// scheme, falling back on HttpUrlPinger"

    invoke-static {v0}, Lcom/daaw/k04;->zze(Ljava/lang/String;)V

    invoke-super {p0, p1}, Lcom/daaw/p04;->zza(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method
