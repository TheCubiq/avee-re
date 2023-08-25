.class public final Lcom/daaw/rm4;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fi6;

.field public final b:Lcom/daaw/th6;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/fi6;Lcom/daaw/th6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rm4;->a:Lcom/daaw/fi6;

    iput-object p2, p0, Lcom/daaw/rm4;->b:Lcom/daaw/th6;

    if-nez p3, :cond_0

    const-string p3, "com.google.ads.mediation.admob.AdMobAdapter"

    :cond_0
    iput-object p3, p0, Lcom/daaw/rm4;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/th6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rm4;->b:Lcom/daaw/th6;

    return-object v0
.end method

.method public final b()Lcom/daaw/wh6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rm4;->a:Lcom/daaw/fi6;

    iget-object v0, v0, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v0, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    return-object v0
.end method

.method public final c()Lcom/daaw/fi6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rm4;->a:Lcom/daaw/fi6;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/rm4;->c:Ljava/lang/String;

    return-object v0
.end method
