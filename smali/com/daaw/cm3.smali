.class public final synthetic Lcom/daaw/cm3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/zg3;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/daaw/zg3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cm3;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/cm3;->b:Lcom/daaw/zg3;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/cm3;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/cm3;->b:Lcom/daaw/zg3;

    check-cast p1, Lcom/daaw/kl3;

    invoke-interface {p1, v0, v1}, Lcom/daaw/kl3;->B0(Ljava/lang/String;Lcom/daaw/zg3;)V

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
