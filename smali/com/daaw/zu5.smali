.class public final synthetic Lcom/daaw/zu5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/av5;

.field public final synthetic b:Lcom/daaw/th6;

.field public final synthetic c:Lcom/daaw/fi6;

.field public final synthetic d:Lcom/daaw/qq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/av5;Lcom/daaw/th6;Lcom/daaw/fi6;Lcom/daaw/qq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zu5;->a:Lcom/daaw/av5;

    iput-object p2, p0, Lcom/daaw/zu5;->b:Lcom/daaw/th6;

    iput-object p3, p0, Lcom/daaw/zu5;->c:Lcom/daaw/fi6;

    iput-object p4, p0, Lcom/daaw/zu5;->d:Lcom/daaw/qq5;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 4

    iget-object v0, p0, Lcom/daaw/zu5;->a:Lcom/daaw/av5;

    iget-object v1, p0, Lcom/daaw/zu5;->b:Lcom/daaw/th6;

    iget-object v2, p0, Lcom/daaw/zu5;->c:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/zu5;->d:Lcom/daaw/qq5;

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/daaw/av5;->b(Lcom/daaw/th6;Lcom/daaw/fi6;Lcom/daaw/qq5;Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
