.class public final synthetic Lcom/daaw/km3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/mm3;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/mm3;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/km3;->a:Lcom/daaw/mm3;

    iput-object p2, p0, Lcom/daaw/km3;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/km3;->a:Lcom/daaw/mm3;

    iget-object v1, p0, Lcom/daaw/km3;->b:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/kl3;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/mm3;->b(Ljava/lang/Object;Lcom/daaw/kl3;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
