.class public Landroidx/fragment/app/Fragment$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/fragment/app/Fragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation


# instance fields
.field public a:Landroid/view/View;

.field public b:Landroid/animation/Animator;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Boolean;

.field public r:Ljava/lang/Boolean;

.field public s:F

.field public t:Landroid/view/View;

.field public u:Z

.field public v:Landroidx/fragment/app/Fragment$h;

.field public w:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/Fragment$e;->k:Ljava/lang/Object;

    sget-object v1, Landroidx/fragment/app/Fragment;->p0:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/fragment/app/Fragment$e;->l:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/fragment/app/Fragment$e;->m:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/fragment/app/Fragment$e;->n:Ljava/lang/Object;

    iput-object v0, p0, Landroidx/fragment/app/Fragment$e;->o:Ljava/lang/Object;

    iput-object v1, p0, Landroidx/fragment/app/Fragment$e;->p:Ljava/lang/Object;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Landroidx/fragment/app/Fragment$e;->s:F

    iput-object v0, p0, Landroidx/fragment/app/Fragment$e;->t:Landroid/view/View;

    return-void
.end method
