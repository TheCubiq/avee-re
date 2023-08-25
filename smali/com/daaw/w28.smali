.class public final synthetic Lcom/daaw/w28;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c35;


# instance fields
.field public final synthetic a:Lcom/daaw/q88;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/q88;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w28;->a:Lcom/daaw/q88;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/w28;->a:Lcom/daaw/q88;

    check-cast p1, Lcom/daaw/mv3;

    sget v1, Lcom/daaw/j58;->j0:I

    iget-boolean v0, v0, Lcom/daaw/q88;->g:Z

    invoke-interface {p1, v0}, Lcom/daaw/mv3;->x(Z)V

    return-void
.end method
