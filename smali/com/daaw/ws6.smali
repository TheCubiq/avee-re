.class public final synthetic Lcom/daaw/ws6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gu0;


# instance fields
.field public final synthetic a:Lcom/daaw/at6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/at6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ws6;->a:Lcom/daaw/at6;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ws6;->a:Lcom/daaw/at6;

    invoke-virtual {v0, p1}, Lcom/daaw/at6;->f(Ljava/lang/Exception;)V

    return-void
.end method
