.class public Lcom/daaw/oz$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h7$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/oz;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/avee/comp/playback/e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/oz;


# direct methods
.method public constructor <init>(Lcom/daaw/oz;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/oz$b;->a:Lcom/daaw/oz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/g7;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/oz$b;->a:Lcom/daaw/oz;

    invoke-static {v0}, Lcom/daaw/oz;->F(Lcom/daaw/oz;)Lcom/daaw/g7;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/g7;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/oz$b;->a:Lcom/daaw/oz;

    invoke-static {v0, p1}, Lcom/daaw/oz;->G(Lcom/daaw/oz;Lcom/daaw/g7;)Lcom/daaw/g7;

    iget-object p1, p0, Lcom/daaw/oz$b;->a:Lcom/daaw/oz;

    invoke-static {p1}, Lcom/daaw/oz;->H(Lcom/daaw/oz;)V

    :cond_0
    return-void
.end method
