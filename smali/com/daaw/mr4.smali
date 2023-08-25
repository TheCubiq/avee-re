.class public final synthetic Lcom/daaw/mr4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/mr4;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mr4;->a:Landroid/content/Context;

    check-cast p1, Lcom/daaw/jr4;

    invoke-interface {p1, v0}, Lcom/daaw/jr4;->s(Landroid/content/Context;)V

    return-void
.end method
