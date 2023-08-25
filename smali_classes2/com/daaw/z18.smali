.class public final synthetic Lcom/daaw/z18;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e48;


# instance fields
.field public final synthetic p:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z18;->p:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/z18;->p:Landroid/content/Context;

    sget v1, Lcom/daaw/j38;->l:I

    invoke-static {v0}, Lcom/daaw/n18;->a(Landroid/content/Context;)Lcom/daaw/y38;

    move-result-object v0

    return-object v0
.end method
