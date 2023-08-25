.class public final Lcom/daaw/a36;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/db5;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/daaw/ri6;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/db5;Lcom/daaw/ri6;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a36;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/a36;->b:Lcom/daaw/db5;

    iput-object p3, p0, Lcom/daaw/a36;->d:Lcom/daaw/ri6;

    iput-object p4, p0, Lcom/daaw/a36;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/b36;
    .locals 3

    iget-object v0, p0, Lcom/daaw/a36;->b:Lcom/daaw/db5;

    iget-object v1, p0, Lcom/daaw/a36;->d:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->f:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/a36;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/db5;->b(Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/a36;->b:Lcom/daaw/db5;

    invoke-virtual {v1}, Lcom/daaw/db5;->a()Lorg/json/JSONObject;

    move-result-object v1

    new-instance v2, Lcom/daaw/b36;

    invoke-direct {v2, v0, v1}, Lcom/daaw/b36;-><init>(Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-object v2
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x11

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/a36;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/z26;

    invoke-direct {v1, p0}, Lcom/daaw/z26;-><init>(Lcom/daaw/a36;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
