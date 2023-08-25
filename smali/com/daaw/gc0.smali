.class public final synthetic Lcom/daaw/gc0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vw1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/nc0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/nc0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/gc0;->a:Lcom/daaw/nc0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/gc0;->a:Lcom/daaw/nc0;

    invoke-static {v0}, Lcom/daaw/nc0;->b(Lcom/daaw/nc0;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
