.class public Lcom/daaw/vx$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/vx;->h(Landroid/app/AlertDialog$Builder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/vx;


# direct methods
.method public constructor <init>(Lcom/daaw/vx;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/vx$b;->p:Lcom/daaw/vx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    sget-object p2, Lcom/daaw/vx;->v:Lcom/daaw/qw1;

    iget-object v0, p0, Lcom/daaw/vx$b;->p:Lcom/daaw/vx;

    invoke-virtual {p2, v0}, Lcom/daaw/qw1;->a(Ljava/lang/Object;)V

    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
