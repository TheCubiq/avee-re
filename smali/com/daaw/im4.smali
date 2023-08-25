.class public final synthetic Lcom/daaw/im4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/o67;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o67;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/im4;->a:Lcom/daaw/o67;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 1

    iget-object v0, p0, Lcom/daaw/im4;->a:Lcom/daaw/o67;

    check-cast p1, Ljava/lang/Throwable;

    invoke-interface {v0, p1}, Lcom/daaw/o67;->b(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    invoke-static {p1}, Lcom/daaw/s67;->i(Ljava/lang/Object;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
