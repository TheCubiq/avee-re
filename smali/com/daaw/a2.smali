.class public final synthetic Lcom/daaw/a2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h0;


# instance fields
.field public final synthetic a:Lcom/daaw/l31;

.field public final synthetic b:Lcom/daaw/l31;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/l31;Lcom/daaw/l31;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/a2;->a:Lcom/daaw/l31;

    iput-object p2, p0, Lcom/daaw/a2;->b:Lcom/daaw/l31;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a2;->a:Lcom/daaw/l31;

    iget-object v1, p0, Lcom/daaw/a2;->b:Lcom/daaw/l31;

    invoke-static {v0, v1}, Lcom/daaw/g2;->d(Lcom/daaw/l31;Lcom/daaw/l31;)V

    return-void
.end method
