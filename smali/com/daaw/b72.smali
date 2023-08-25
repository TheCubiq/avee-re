.class public final Lcom/daaw/b72;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:I

.field public f:I

.field public g:Ljava/lang/String;

.field public h:Lcom/google/android/gms/internal/ads/zzbq;

.field public i:Ljava/lang/String;

.field public j:Ljava/lang/String;

.field public k:I

.field public l:Ljava/util/List;

.field public m:Lcom/google/android/gms/internal/ads/zzx;

.field public n:J

.field public o:I

.field public p:I

.field public q:F

.field public r:I

.field public s:F

.field public t:[B

.field public u:I

.field public v:Lcom/daaw/mo8;

.field public w:I

.field public x:I

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/b72;->e:I

    iput v0, p0, Lcom/daaw/b72;->f:I

    iput v0, p0, Lcom/daaw/b72;->k:I

    const-wide v1, 0x7fffffffffffffffL

    iput-wide v1, p0, Lcom/daaw/b72;->n:J

    iput v0, p0, Lcom/daaw/b72;->o:I

    iput v0, p0, Lcom/daaw/b72;->p:I

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/daaw/b72;->q:F

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lcom/daaw/b72;->s:F

    iput v0, p0, Lcom/daaw/b72;->u:I

    iput v0, p0, Lcom/daaw/b72;->w:I

    iput v0, p0, Lcom/daaw/b72;->x:I

    iput v0, p0, Lcom/daaw/b72;->y:I

    iput v0, p0, Lcom/daaw/b72;->B:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/b72;->C:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/daaw/f92;Lcom/daaw/f62;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p2, p1, Lcom/daaw/f92;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/b72;->a:Ljava/lang/String;

    iget-object p2, p1, Lcom/daaw/f92;->b:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/b72;->b:Ljava/lang/String;

    iget-object p2, p1, Lcom/daaw/f92;->c:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/b72;->c:Ljava/lang/String;

    iget p2, p1, Lcom/daaw/f92;->d:I

    iput p2, p0, Lcom/daaw/b72;->d:I

    iget p2, p1, Lcom/daaw/f92;->f:I

    iput p2, p0, Lcom/daaw/b72;->e:I

    iget p2, p1, Lcom/daaw/f92;->g:I

    iput p2, p0, Lcom/daaw/b72;->f:I

    iget-object p2, p1, Lcom/daaw/f92;->i:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/b72;->g:Ljava/lang/String;

    iget-object p2, p1, Lcom/daaw/f92;->j:Lcom/google/android/gms/internal/ads/zzbq;

    iput-object p2, p0, Lcom/daaw/b72;->h:Lcom/google/android/gms/internal/ads/zzbq;

    iget-object p2, p1, Lcom/daaw/f92;->k:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/b72;->i:Ljava/lang/String;

    iget-object p2, p1, Lcom/daaw/f92;->l:Ljava/lang/String;

    iput-object p2, p0, Lcom/daaw/b72;->j:Ljava/lang/String;

    iget p2, p1, Lcom/daaw/f92;->m:I

    iput p2, p0, Lcom/daaw/b72;->k:I

    iget-object p2, p1, Lcom/daaw/f92;->n:Ljava/util/List;

    iput-object p2, p0, Lcom/daaw/b72;->l:Ljava/util/List;

    iget-object p2, p1, Lcom/daaw/f92;->o:Lcom/google/android/gms/internal/ads/zzx;

    iput-object p2, p0, Lcom/daaw/b72;->m:Lcom/google/android/gms/internal/ads/zzx;

    iget-wide v0, p1, Lcom/daaw/f92;->p:J

    iput-wide v0, p0, Lcom/daaw/b72;->n:J

    iget p2, p1, Lcom/daaw/f92;->q:I

    iput p2, p0, Lcom/daaw/b72;->o:I

    iget p2, p1, Lcom/daaw/f92;->r:I

    iput p2, p0, Lcom/daaw/b72;->p:I

    iget p2, p1, Lcom/daaw/f92;->s:F

    iput p2, p0, Lcom/daaw/b72;->q:F

    iget p2, p1, Lcom/daaw/f92;->t:I

    iput p2, p0, Lcom/daaw/b72;->r:I

    iget p2, p1, Lcom/daaw/f92;->u:F

    iput p2, p0, Lcom/daaw/b72;->s:F

    iget-object p2, p1, Lcom/daaw/f92;->v:[B

    iput-object p2, p0, Lcom/daaw/b72;->t:[B

    iget p2, p1, Lcom/daaw/f92;->w:I

    iput p2, p0, Lcom/daaw/b72;->u:I

    iget-object p2, p1, Lcom/daaw/f92;->x:Lcom/daaw/mo8;

    iput-object p2, p0, Lcom/daaw/b72;->v:Lcom/daaw/mo8;

    iget p2, p1, Lcom/daaw/f92;->y:I

    iput p2, p0, Lcom/daaw/b72;->w:I

    iget p2, p1, Lcom/daaw/f92;->z:I

    iput p2, p0, Lcom/daaw/b72;->x:I

    iget p2, p1, Lcom/daaw/f92;->A:I

    iput p2, p0, Lcom/daaw/b72;->y:I

    iget p2, p1, Lcom/daaw/f92;->B:I

    iput p2, p0, Lcom/daaw/b72;->z:I

    iget p2, p1, Lcom/daaw/f92;->C:I

    iput p2, p0, Lcom/daaw/b72;->A:I

    iget p2, p1, Lcom/daaw/f92;->D:I

    iput p2, p0, Lcom/daaw/b72;->B:I

    iget p1, p1, Lcom/daaw/f92;->E:I

    iput p1, p0, Lcom/daaw/b72;->C:I

    return-void
.end method

.method public static bridge synthetic A(Lcom/daaw/b72;)F
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->q:F

    return p0
.end method

.method public static bridge synthetic B(Lcom/daaw/b72;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->g:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic C(Lcom/daaw/b72;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->i:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic D(Lcom/daaw/b72;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic E(Lcom/daaw/b72;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->b:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic F(Lcom/daaw/b72;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic G(Lcom/daaw/b72;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->j:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic H(Lcom/daaw/b72;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->l:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic I(Lcom/daaw/b72;)[B
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->t:[B

    return-object p0
.end method

.method public static bridge synthetic J(Lcom/daaw/b72;)F
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->s:F

    return p0
.end method

.method public static bridge synthetic K(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->B:I

    return p0
.end method

.method public static bridge synthetic L(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->e:I

    return p0
.end method

.method public static bridge synthetic M(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->w:I

    return p0
.end method

.method public static bridge synthetic N(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->C:I

    return p0
.end method

.method public static bridge synthetic O(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->z:I

    return p0
.end method

.method public static bridge synthetic P(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->A:I

    return p0
.end method

.method public static bridge synthetic Q(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->p:I

    return p0
.end method

.method public static bridge synthetic R(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->k:I

    return p0
.end method

.method public static bridge synthetic S(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->y:I

    return p0
.end method

.method public static bridge synthetic T(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->f:I

    return p0
.end method

.method public static bridge synthetic U(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->r:I

    return p0
.end method

.method public static bridge synthetic V(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->x:I

    return p0
.end method

.method public static bridge synthetic W(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->d:I

    return p0
.end method

.method public static bridge synthetic X(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->u:I

    return p0
.end method

.method public static bridge synthetic Y(Lcom/daaw/b72;)I
    .locals 0

    iget p0, p0, Lcom/daaw/b72;->o:I

    return p0
.end method

.method public static bridge synthetic Z(Lcom/daaw/b72;)J
    .locals 2

    iget-wide v0, p0, Lcom/daaw/b72;->n:J

    return-wide v0
.end method

.method public static bridge synthetic a0(Lcom/daaw/b72;)Lcom/daaw/mo8;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->v:Lcom/daaw/mo8;

    return-object p0
.end method

.method public static bridge synthetic b0(Lcom/daaw/b72;)Lcom/google/android/gms/internal/ads/zzx;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->m:Lcom/google/android/gms/internal/ads/zzx;

    return-object p0
.end method

.method public static bridge synthetic z(Lcom/daaw/b72;)Lcom/google/android/gms/internal/ads/zzbq;
    .locals 0

    iget-object p0, p0, Lcom/daaw/b72;->h:Lcom/google/android/gms/internal/ads/zzbq;

    return-object p0
.end method


# virtual methods
.method public final a(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->C:I

    return-object p0
.end method

.method public final b(Lcom/google/android/gms/internal/ads/zzx;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->m:Lcom/google/android/gms/internal/ads/zzx;

    return-object p0
.end method

.method public final c(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->z:I

    return-object p0
.end method

.method public final c0(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->B:I

    return-object p0
.end method

.method public final d(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->A:I

    return-object p0
.end method

.method public final d0(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->e:I

    return-object p0
.end method

.method public final e(F)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->q:F

    return-object p0
.end method

.method public final e0(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->w:I

    return-object p0
.end method

.method public final f(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->p:I

    return-object p0
.end method

.method public final f0(Ljava/lang/String;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->g:Ljava/lang/String;

    return-object p0
.end method

.method public final g(I)Lcom/daaw/b72;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/b72;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final g0(Lcom/daaw/mo8;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->v:Lcom/daaw/mo8;

    return-object p0
.end method

.method public final h(Ljava/lang/String;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final h0(Ljava/lang/String;)Lcom/daaw/b72;
    .locals 0

    const-string p1, "image/jpeg"

    iput-object p1, p0, Lcom/daaw/b72;->i:Ljava/lang/String;

    return-object p0
.end method

.method public final i(Ljava/util/List;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->l:Ljava/util/List;

    return-object p0
.end method

.method public final j(Ljava/lang/String;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final k(Ljava/lang/String;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final l(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->k:I

    return-object p0
.end method

.method public final m(Lcom/google/android/gms/internal/ads/zzbq;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->h:Lcom/google/android/gms/internal/ads/zzbq;

    return-object p0
.end method

.method public final n(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->y:I

    return-object p0
.end method

.method public final o(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->f:I

    return-object p0
.end method

.method public final p(F)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->s:F

    return-object p0
.end method

.method public final q([B)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->t:[B

    return-object p0
.end method

.method public final r(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->r:I

    return-object p0
.end method

.method public final s(Ljava/lang/String;)Lcom/daaw/b72;
    .locals 0

    iput-object p1, p0, Lcom/daaw/b72;->j:Ljava/lang/String;

    return-object p0
.end method

.method public final t(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->x:I

    return-object p0
.end method

.method public final u(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->d:I

    return-object p0
.end method

.method public final v(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->u:I

    return-object p0
.end method

.method public final w(J)Lcom/daaw/b72;
    .locals 0

    iput-wide p1, p0, Lcom/daaw/b72;->n:J

    return-object p0
.end method

.method public final x(I)Lcom/daaw/b72;
    .locals 0

    iput p1, p0, Lcom/daaw/b72;->o:I

    return-object p0
.end method

.method public final y()Lcom/daaw/f92;
    .locals 2

    new-instance v0, Lcom/daaw/f92;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/daaw/f92;-><init>(Lcom/daaw/b72;Lcom/daaw/y72;)V

    return-object v0
.end method
