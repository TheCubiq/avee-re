.class public final synthetic Lcom/daaw/r08;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/iz6;


# instance fields
.field public final synthetic p:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r08;->p:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/r08;->p:Landroid/content/Context;

    new-instance v1, Lcom/daaw/rv8;

    invoke-direct {v1, v0}, Lcom/daaw/rv8;-><init>(Landroid/content/Context;)V

    return-object v1
.end method
