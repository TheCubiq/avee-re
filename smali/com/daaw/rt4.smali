.class public final synthetic Lcom/daaw/rt4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/dv4;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/rt4;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/rt4;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rt4;->a:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/rt4;->b:Ljava/lang/String;

    check-cast p1, Lcom/daaw/az5;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/az5;->H(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
