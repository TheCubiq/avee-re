.class public abstract Lcom/daaw/l0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ch0;


# direct methods
.method public constructor <init>(Lcom/daaw/ch0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l0;->a:Lcom/daaw/ch0;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/al;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l0;->a:Lcom/daaw/ch0;

    invoke-virtual {v0, p1, p2, p0}, Lcom/daaw/ch0;->a(Lcom/daaw/al;Ljava/lang/Object;Lcom/daaw/l0;)V

    return-void
.end method

.method public b()Lcom/daaw/ch0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/l0;->a:Lcom/daaw/ch0;

    return-object v0
.end method
